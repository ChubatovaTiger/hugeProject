package subProj_1600

import subProj_1600.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1600")
    name = "subProj 1600"

    buildType(subProj_bt_1600_4)
    buildType(subProj_bt_1600_3)
    buildType(subProj_bt_1600_2)
    buildType(subProj_bt_1600_1)
    buildType(subProj_bt_1600_0)
    buildType(subProj_bt_1600_5)
})
