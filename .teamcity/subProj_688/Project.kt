package subProj_688

import subProj_688.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_688")
    name = "subProj 688"

    buildType(subProj_bt_688_0)
    buildType(subProj_bt_688_1)
    buildType(subProj_bt_688_2)
    buildType(subProj_bt_688_3)
    buildType(subProj_bt_688_4)
    buildType(subProj_bt_688_5)
})
