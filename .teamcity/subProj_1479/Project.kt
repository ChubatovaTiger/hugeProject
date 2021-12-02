package subProj_1479

import subProj_1479.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1479")
    name = "subProj 1479"

    buildType(subProj_bt_1479_5)
    buildType(subProj_bt_1479_3)
    buildType(subProj_bt_1479_4)
    buildType(subProj_bt_1479_1)
    buildType(subProj_bt_1479_2)
    buildType(subProj_bt_1479_0)
})
