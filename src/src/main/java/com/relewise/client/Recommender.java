package com.relewise.client;

import com.relewise.client.model.*;
import com.relewise.client.infrastructure.*;
import java.io.IOException;

public class Recommender extends RelewiseClient
{
    public Recommender(String datasetId, String apiKey, String serverUrl) { super(datasetId, apiKey, serverUrl, 5); }
    public Recommender(String datasetId, String apiKey, String serverUrl, int timeout) { super(datasetId, apiKey, serverUrl, timeout); }
    
    public ProductRecommendationResponse recommend(PurchasedWithProductRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("PurchasedWithProductRequest", request, ProductRecommendationResponse.class);
    }
    
    public ProductRecommendationResponse recommend(PurchasedWithMultipleProductsRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("PurchasedWithMultipleProductsRequest", request, ProductRecommendationResponse.class);
    }
    
    public ProductRecommendationResponse recommend(PurchasedWithCurrentCartRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("PurchasedWithCurrentCartRequest", request, ProductRecommendationResponse.class);
    }
    
    public ProductRecommendationResponse recommend(ProductsViewedAfterViewingProductRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ProductsViewedAfterViewingProductRequest", request, ProductRecommendationResponse.class);
    }
    
    public ProductRecommendationResponse recommend(ProductsViewedAfterViewingContentRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ProductsViewedAfterViewingContentRequest", request, ProductRecommendationResponse.class);
    }
    
    public ProductRecommendationResponse recommend(SimilarProductsRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("SimilarProductsRequest", request, ProductRecommendationResponse.class);
    }
    
    public ProductRecommendationResponse recommend(PopularProductsRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("PopularProductsRequest", request, ProductRecommendationResponse.class);
    }
    
    public ProductRecommendationResponse recommend(RecentlyViewedProductsRequest productsRequest) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("RecentlyViewedProductsRequest", productsRequest, ProductRecommendationResponse.class);
    }
    
    public ProductRecommendationResponse recommend(PersonalProductRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("PersonalProductRecommendationRequest", request, ProductRecommendationResponse.class);
    }
    
    public ProductRecommendationResponse recommend(SearchTermBasedProductRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("SearchTermBasedProductRecommendationRequest", request, ProductRecommendationResponse.class);
    }
    
    public SearchTermRecommendationResponse recommend(PopularSearchTermsRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("PopularSearchTermsRecommendationRequest", request, SearchTermRecommendationResponse.class);
    }
    
    public ProductRecommendationResponse recommend(SortProductsRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("SortProductsRequest", request, ProductRecommendationResponse.class);
    }
    
    public ProductRecommendationResponse recommend(SortVariantsRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("SortVariantsRequest", request, ProductRecommendationResponse.class);
    }
    
    public ProductRecommendationResponse recommend(CustomProductRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("CustomProductRecommendationRequest", request, ProductRecommendationResponse.class);
    }
    
    public ContentRecommendationResponse recommend(ContentsViewedAfterViewingContentRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ContentsViewedAfterViewingContentRequest", request, ContentRecommendationResponse.class);
    }
    
    public ContentRecommendationResponse recommend(PersonalContentRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("PersonalContentRecommendationRequest", request, ContentRecommendationResponse.class);
    }
    
    public ContentRecommendationResponse recommend(ContentsViewedAfterViewingMultipleContentsRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ContentsViewedAfterViewingMultipleContentsRequest", request, ContentRecommendationResponse.class);
    }
    
    public ContentRecommendationResponse recommend(ContentsViewedAfterViewingProductRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ContentsViewedAfterViewingProductRequest", request, ContentRecommendationResponse.class);
    }
    
    public ContentRecommendationResponse recommend(ContentsViewedAfterViewingMultipleProductsRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ContentsViewedAfterViewingMultipleProductsRequest", request, ContentRecommendationResponse.class);
    }
    
    public ContentRecommendationResponse recommend(PopularContentsRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("PopularContentsRequest", request, ContentRecommendationResponse.class);
    }
    
    public ContentCategoryRecommendationResponse recommend(PopularContentCategoriesRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("PopularContentCategoriesRecommendationRequest", request, ContentCategoryRecommendationResponse.class);
    }
    
    public ContentCategoryRecommendationResponse recommend(PersonalContentCategoryRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("PersonalContentCategoryRecommendationRequest", request, ContentCategoryRecommendationResponse.class);
    }
    
    public ProductCategoryRecommendationResponse recommend(PopularProductCategoriesRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("PopularProductCategoriesRecommendationRequest", request, ProductCategoryRecommendationResponse.class);
    }
    
    public ProductCategoryRecommendationResponse recommend(PersonalProductCategoryRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("PersonalProductCategoryRecommendationRequest", request, ProductCategoryRecommendationResponse.class);
    }
    
    public BrandRecommendationResponse recommend(PopularBrandsRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("PopularBrandsRecommendationRequest", request, BrandRecommendationResponse.class);
    }
    
    public BrandRecommendationResponse recommend(PersonalBrandRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("PersonalBrandRecommendationRequest", request, BrandRecommendationResponse.class);
    }
    
    public FeedRecommendationResponse recommend(FeedRecommendationInitializationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("FeedRecommendationInitializationRequest", request, FeedRecommendationResponse.class);
    }
    
    public FeedRecommendationResponse recommend(FeedRecommendationNextItemsRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("FeedRecommendationNextItemsRequest", request, FeedRecommendationResponse.class);
    }
    
    public BrandRecommendationResponse recommend(BrandRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("BrandRecommendationRequest", request, BrandRecommendationResponse.class);
    }
    
    public ProductRecommendationResponseCollection recommend(ProductRecommendationRequestCollection request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ProductRecommendationRequestCollection", request, ProductRecommendationResponseCollection.class);
    }
    
    public ContentRecommendationResponseCollection recommend(ContentRecommendationRequestCollection request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ContentRecommendationRequestCollection", request, ContentRecommendationResponseCollection.class);
    }
    
    public ProductRecommendationResponse recommend(ProductRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ProductRecommendationRequest", request, ProductRecommendationResponse.class);
    }
    
    public ContentRecommendationResponse recommend(ContentRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ContentRecommendationRequest", request, ContentRecommendationResponse.class);
    }
    
    public ContentCategoryRecommendationResponse recommend(ContentCategoryRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ContentCategoryRecommendationRequest", request, ContentCategoryRecommendationResponse.class);
    }
    
    public ProductCategoryRecommendationResponse recommend(ProductCategoryRecommendationRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ProductCategoryRecommendationRequest", request, ProductCategoryRecommendationResponse.class);
    }
}
