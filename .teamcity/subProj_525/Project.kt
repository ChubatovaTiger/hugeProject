package subProj_525

import subProj_525.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_525")
    name = "subProj 525"

    buildType(subProj_bt_525_5)
    buildType(subProj_bt_525_4)
    buildType(subProj_bt_525_3)
    buildType(subProj_bt_525_2)
    buildType(subProj_bt_525_1)
    buildType(subProj_bt_525_0)
})
