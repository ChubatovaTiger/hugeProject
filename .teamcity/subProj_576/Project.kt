package subProj_576

import subProj_576.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_576")
    name = "subProj 576"

    buildType(subProj_bt_576_1)
    buildType(subProj_bt_576_0)
    buildType(subProj_bt_576_3)
    buildType(subProj_bt_576_2)
    buildType(subProj_bt_576_5)
    buildType(subProj_bt_576_4)
})
