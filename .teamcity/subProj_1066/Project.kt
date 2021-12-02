package subProj_1066

import subProj_1066.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1066")
    name = "subProj 1066"

    buildType(subProj_bt_1066_4)
    buildType(subProj_bt_1066_3)
    buildType(subProj_bt_1066_5)
    buildType(subProj_bt_1066_0)
    buildType(subProj_bt_1066_2)
    buildType(subProj_bt_1066_1)
})
