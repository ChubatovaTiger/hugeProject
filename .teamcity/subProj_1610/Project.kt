package subProj_1610

import subProj_1610.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1610")
    name = "subProj 1610"

    buildType(subProj_bt_1610_5)
    buildType(subProj_bt_1610_4)
    buildType(subProj_bt_1610_3)
    buildType(subProj_bt_1610_2)
    buildType(subProj_bt_1610_1)
    buildType(subProj_bt_1610_0)
})
