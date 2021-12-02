package subProj_1620

import subProj_1620.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1620")
    name = "subProj 1620"

    buildType(subProj_bt_1620_0)
    buildType(subProj_bt_1620_1)
    buildType(subProj_bt_1620_2)
    buildType(subProj_bt_1620_3)
    buildType(subProj_bt_1620_4)
    buildType(subProj_bt_1620_5)
})
