// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.openlayer.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CommitTestResultListResponseTest {

    @Test
    fun createCommitTestResultListResponse() {
        val commitTestResultListResponse =
            CommitTestResultListResponse.builder()
                ._meta(
                    CommitTestResultListResponse._Meta
                        .builder()
                        .page(123L)
                        .perPage(100L)
                        .totalItems(123L)
                        .totalPages(123L)
                        .build()
                )
                .items(
                    listOf(
                        CommitTestResultListResponse.Item.builder()
                            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateDataEnds(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateDataStarts(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .inferencePipelineId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .projectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .status(CommitTestResultListResponse.Item.Status.RUNNING)
                            .statusMessage("Test successfully processed.")
                            .goal(
                                CommitTestResultListResponse.Item.Goal.builder()
                                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                                    .commentCount(123L)
                                    .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                                    .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                                    .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                                    .description(
                                        JsonValue.from(
                                            "This test checks for duplicate rows in the dataset."
                                        )
                                    )
                                    .name("No duplicate rows")
                                    .number(123L)
                                    .originProjectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                                    .subtype("duplicateRowCount")
                                    .suggested(true)
                                    .thresholds(
                                        listOf(
                                            CommitTestResultListResponse.Item.Goal.Threshold
                                                .builder()
                                                .insightName("duplicateRowCount")
                                                .insightParameters(
                                                    listOf(JsonValue.from(mapOf<String, Any>()))
                                                )
                                                .measurement("duplicateRowCount")
                                                .operator("<=")
                                                .value(
                                                    CommitTestResultListResponse.Item.Goal.Threshold
                                                        .Value
                                                        .ofDouble(42.23)
                                                )
                                                .build()
                                        )
                                    )
                                    .type("integrity")
                                    .archived(true)
                                    .delayWindow(42.23)
                                    .evaluationWindow(42.23)
                                    .usesMlModel(true)
                                    .usesProductionData(true)
                                    .usesReferenceDataset(true)
                                    .usesTrainingDataset(true)
                                    .usesValidationDataset(true)
                                    .build()
                            )
                            .goalId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .build()
                    )
                )
                .build()
        assertThat(commitTestResultListResponse).isNotNull
        assertThat(commitTestResultListResponse._meta())
            .isEqualTo(
                CommitTestResultListResponse._Meta
                    .builder()
                    .page(123L)
                    .perPage(100L)
                    .totalItems(123L)
                    .totalPages(123L)
                    .build()
            )
        assertThat(commitTestResultListResponse.items())
            .containsExactly(
                CommitTestResultListResponse.Item.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateDataEnds(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateDataStarts(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .inferencePipelineId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .projectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .status(CommitTestResultListResponse.Item.Status.RUNNING)
                    .statusMessage("Test successfully processed.")
                    .goal(
                        CommitTestResultListResponse.Item.Goal.builder()
                            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .commentCount(123L)
                            .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                            .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .description(
                                JsonValue.from(
                                    "This test checks for duplicate rows in the dataset."
                                )
                            )
                            .name("No duplicate rows")
                            .number(123L)
                            .originProjectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .subtype("duplicateRowCount")
                            .suggested(true)
                            .thresholds(
                                listOf(
                                    CommitTestResultListResponse.Item.Goal.Threshold.builder()
                                        .insightName("duplicateRowCount")
                                        .insightParameters(
                                            listOf(JsonValue.from(mapOf<String, Any>()))
                                        )
                                        .measurement("duplicateRowCount")
                                        .operator("<=")
                                        .value(
                                            CommitTestResultListResponse.Item.Goal.Threshold.Value
                                                .ofDouble(42.23)
                                        )
                                        .build()
                                )
                            )
                            .type("integrity")
                            .archived(true)
                            .delayWindow(42.23)
                            .evaluationWindow(42.23)
                            .usesMlModel(true)
                            .usesProductionData(true)
                            .usesReferenceDataset(true)
                            .usesTrainingDataset(true)
                            .usesValidationDataset(true)
                            .build()
                    )
                    .goalId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .build()
            )
    }
}
