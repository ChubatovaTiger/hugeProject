package subProj_1500

import subProj_1500.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1500")
    name = "subProj 1500"

    buildType(subProj_bt_1500_1)
    buildType(subProj_bt_1500_0)
    buildType(subProj_bt_1500_3)
    buildType(subProj_bt_1500_2)
    buildType(subProj_bt_1500_5)
    buildType(subProj_bt_1500_4)
})
