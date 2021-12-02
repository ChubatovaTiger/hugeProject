package subProj_1089

import subProj_1089.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1089")
    name = "subProj 1089"

    buildType(subProj_bt_1089_4)
    buildType(subProj_bt_1089_5)
    buildType(subProj_bt_1089_2)
    buildType(subProj_bt_1089_3)
    buildType(subProj_bt_1089_0)
    buildType(subProj_bt_1089_1)
})
