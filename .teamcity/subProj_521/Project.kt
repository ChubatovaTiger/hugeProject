package subProj_521

import subProj_521.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_521")
    name = "subProj 521"

    buildType(subProj_bt_521_5)
    buildType(subProj_bt_521_4)
    buildType(subProj_bt_521_3)
    buildType(subProj_bt_521_2)
    buildType(subProj_bt_521_1)
    buildType(subProj_bt_521_0)
})
