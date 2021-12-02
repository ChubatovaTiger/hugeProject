package subProj_1153

import subProj_1153.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1153")
    name = "subProj 1153"

    buildType(subProj_bt_1153_5)
    buildType(subProj_bt_1153_4)
    buildType(subProj_bt_1153_3)
    buildType(subProj_bt_1153_2)
    buildType(subProj_bt_1153_1)
    buildType(subProj_bt_1153_0)
})
