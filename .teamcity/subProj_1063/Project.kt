package subProj_1063

import subProj_1063.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1063")
    name = "subProj 1063"

    buildType(subProj_bt_1063_3)
    buildType(subProj_bt_1063_2)
    buildType(subProj_bt_1063_5)
    buildType(subProj_bt_1063_4)
    buildType(subProj_bt_1063_1)
    buildType(subProj_bt_1063_0)
})
