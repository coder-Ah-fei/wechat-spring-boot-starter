package com.fanhua.xia.wechatspringbootstarter.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 请求微信支付传参的模型
 */
public class WxPaySendData {
	
	/**
	 * 公众账号ID 必须
	 */
	@XStreamAlias("appid")
	private String appId;
	
	/**
	 * 商户号 必须
	 */
	@XStreamAlias("mch_id")
	private String mchId;
	
	/**
	 * 设备号
	 */
	@XStreamAlias("device_info")
	private String deviceInfo;
	
	/**
	 * 随机字符串 必须
	 */
	@XStreamAlias("nonce_str")
	private String nonceStr;
	
	/**
	 * 签名 必须
	 */
	@XStreamAlias("sign")
	private String sign;
	
	/**
	 * 商品描述 必须
	 */
	@XStreamAlias("body")
	private String body;
	
	/**
	 * 商品详情
	 */
	@XStreamAlias("detail")
	private String detail;
	
	/**
	 * 附加数据
	 */
	@XStreamAlias("attach")
	private String attach;
	
	/**
	 * 商户订单号 必须
	 */
	@XStreamAlias("out_trade_no")
	private String outTradeNo;
	
	/**
	 * 货币类型
	 */
	@XStreamAlias("fee_type")
	private String feeType;
	
	/**
	 * 交易金额 必须[JSAPI，NATIVE，APP]
	 */
	@XStreamAlias("total_fee")
	private int totalFee;
	
	/**
	 * 交易类型 [必须]
	 */
	@XStreamAlias("trade_type")
	private String tradeType;
	
	/**
	 * 通知地址 [必须]
	 */
	@XStreamAlias("notify_url")
	private String notifyUrl;
	
	/**
	 * 终端Ip [必须]
	 */
	@XStreamAlias("spbill_create_ip")
	private String spBillCreateIp;
	
	/**
	 * 订单生成时间yyyyMMddHHmmss
	 */
	@XStreamAlias("time_start")
	private String timeStart;
	
	/**
	 * 订单失效时间yyyyMMddHHmmss 间隔>5min
	 */
	@XStreamAlias("time_expire")
	private String timeExpire;
	
	/**
	 * 用户标识 tradeType=JSAPI时必须
	 */
	@XStreamAlias("openid")
	private String openId;
	
	/**
	 * 商品标记
	 */
	@XStreamAlias("goods_tag")
	private String goodsTag;
	
	/**
	 * 商品ID tradeType=NATIVE时必须
	 */
	@XStreamAlias("product_id")
	private String productId;
	
	/**
	 * 指定支付方式
	 */
	@XStreamAlias("limit_pay")
	private String limitPay;
	
	
	/**
	 *以下属性为申请退款参数
	 */
	/**
	 * 微信订单号 [商户订单号二选一]
	 */
	@XStreamAlias("transaction_id")
	private String transactionId;
	
	/**
	 * 商户退款单号 [必须]
	 */
	@XStreamAlias("out_refund_no")
	private String outRefundNo;
	
	/**
	 * 退款金额 [必须]
	 */
	@XStreamAlias("refund_fee")
	private Integer refundFee;
	
	/**
	 * 货币种类
	 */
	@XStreamAlias("refund_fee_type")
	private String refundFeeType;
	
	/**
	 * 操作员账号:默认为商户号 [必须]
	 */
	@XStreamAlias("op_user_id")
	private String opUserId;
	
	public String getAppId() {
		return appId;
	}
	
	public WxPaySendData setAppId(String appId) {
		this.appId = appId;
		return this;
	}
	
	public String getMchId() {
		return mchId;
	}
	
	public WxPaySendData setMchId(String mchId) {
		this.mchId = mchId;
		return this;
	}
	
	public String getDeviceInfo() {
		return deviceInfo;
	}
	
	public WxPaySendData setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
		return this;
	}
	
	public String getNonceStr() {
		return nonceStr;
	}
	
	public WxPaySendData setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
		return this;
	}
	
	public String getSign() {
		return sign;
	}
	
	public WxPaySendData setSign(String sign) {
		this.sign = sign;
		return this;
	}
	
	public String getBody() {
		return body;
	}
	
	public WxPaySendData setBody(String body) {
		this.body = body;
		return this;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public WxPaySendData setDetail(String detail) {
		this.detail = detail;
		return this;
	}
	
	public String getAttach() {
		return attach;
	}
	
	public WxPaySendData setAttach(String attach) {
		this.attach = attach;
		return this;
	}
	
	public String getOutTradeNo() {
		return outTradeNo;
	}
	
	public WxPaySendData setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
		return this;
	}
	
	public String getFeeType() {
		return feeType;
	}
	
	public WxPaySendData setFeeType(String feeType) {
		this.feeType = feeType;
		return this;
	}
	
	public int getTotalFee() {
		return totalFee;
	}
	
	public WxPaySendData setTotalFee(int totalFee) {
		this.totalFee = totalFee;
		return this;
	}
	
	public String getTradeType() {
		return tradeType;
	}
	
	public WxPaySendData setTradeType(String tradeType) {
		this.tradeType = tradeType;
		return this;
	}
	
	public String getNotifyUrl() {
		return notifyUrl;
	}
	
	public WxPaySendData setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
		return this;
	}
	
	public String getSpBillCreateIp() {
		return spBillCreateIp;
	}
	
	public WxPaySendData setSpBillCreateIp(String spBillCreateIp) {
		this.spBillCreateIp = spBillCreateIp;
		return this;
	}
	
	public String getTimeStart() {
		return timeStart;
	}
	
	public WxPaySendData setTimeStart(String timeStart) {
		this.timeStart = timeStart;
		return this;
	}
	
	public String getTimeExpire() {
		return timeExpire;
	}
	
	public WxPaySendData setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
		return this;
	}
	
	public String getOpenId() {
		return openId;
	}
	
	public WxPaySendData setOpenId(String openId) {
		this.openId = openId;
		return this;
	}
	
	public String getGoodsTag() {
		return goodsTag;
	}
	
	public WxPaySendData setGoodsTag(String goodsTag) {
		this.goodsTag = goodsTag;
		return this;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public WxPaySendData setProductId(String productId) {
		this.productId = productId;
		return this;
	}
	
	public String getLimitPay() {
		return limitPay;
	}
	
	public WxPaySendData setLimitPay(String limitPay) {
		this.limitPay = limitPay;
		return this;
	}
	
	public String getTransactionId() {
		return transactionId;
	}
	
	public WxPaySendData setTransactionId(String transactionId) {
		this.transactionId = transactionId;
		return this;
	}
	
	public String getOutRefundNo() {
		return outRefundNo;
	}
	
	public WxPaySendData setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
		return this;
	}
	
	public Integer getRefundFee() {
		return refundFee;
	}
	
	public WxPaySendData setRefundFee(Integer refundFee) {
		this.refundFee = refundFee;
		return this;
	}
	
	public String getRefundFeeType() {
		return refundFeeType;
	}
	
	public WxPaySendData setRefundFeeType(String refundFeeType) {
		this.refundFeeType = refundFeeType;
		return this;
	}
	
	public String getOpUserId() {
		return opUserId;
	}
	
	public WxPaySendData setOpUserId(String opUserId) {
		this.opUserId = opUserId;
		return this;
	}
}
