package subProj_907

import subProj_907.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_907")
    name = "subProj 907"

    buildType(subProj_bt_907_4)
    buildType(subProj_bt_907_5)
    buildType(subProj_bt_907_2)
    buildType(subProj_bt_907_3)
    buildType(subProj_bt_907_0)
    buildType(subProj_bt_907_1)
})
