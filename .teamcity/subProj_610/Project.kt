package subProj_610

import subProj_610.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_610")
    name = "subProj 610"

    buildType(subProj_bt_610_3)
    buildType(subProj_bt_610_4)
    buildType(subProj_bt_610_5)
    buildType(subProj_bt_610_0)
    buildType(subProj_bt_610_1)
    buildType(subProj_bt_610_2)
})
