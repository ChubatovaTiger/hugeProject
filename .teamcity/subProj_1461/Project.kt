package subProj_1461

import subProj_1461.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1461")
    name = "subProj 1461"

    buildType(subProj_bt_1461_1)
    buildType(subProj_bt_1461_0)
    buildType(subProj_bt_1461_3)
    buildType(subProj_bt_1461_2)
    buildType(subProj_bt_1461_5)
    buildType(subProj_bt_1461_4)
})
