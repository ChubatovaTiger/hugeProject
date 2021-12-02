package subProj_562

import subProj_562.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_562")
    name = "subProj 562"

    buildType(subProj_bt_562_4)
    buildType(subProj_bt_562_3)
    buildType(subProj_bt_562_5)
    buildType(subProj_bt_562_0)
    buildType(subProj_bt_562_2)
    buildType(subProj_bt_562_1)
})
