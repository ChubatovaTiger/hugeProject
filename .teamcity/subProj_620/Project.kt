package subProj_620

import subProj_620.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_620")
    name = "subProj 620"

    buildType(subProj_bt_620_5)
    buildType(subProj_bt_620_4)
    buildType(subProj_bt_620_1)
    buildType(subProj_bt_620_0)
    buildType(subProj_bt_620_3)
    buildType(subProj_bt_620_2)
})
