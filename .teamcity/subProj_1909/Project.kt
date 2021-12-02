package subProj_1909

import subProj_1909.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1909")
    name = "subProj 1909"

    buildType(subProj_bt_1909_2)
    buildType(subProj_bt_1909_1)
    buildType(subProj_bt_1909_4)
    buildType(subProj_bt_1909_3)
    buildType(subProj_bt_1909_5)
    buildType(subProj_bt_1909_0)
})
