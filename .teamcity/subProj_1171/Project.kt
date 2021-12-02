package subProj_1171

import subProj_1171.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1171")
    name = "subProj 1171"

    buildType(subProj_bt_1171_4)
    buildType(subProj_bt_1171_5)
    buildType(subProj_bt_1171_0)
    buildType(subProj_bt_1171_1)
    buildType(subProj_bt_1171_2)
    buildType(subProj_bt_1171_3)
})
