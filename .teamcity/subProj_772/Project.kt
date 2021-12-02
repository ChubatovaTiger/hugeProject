package subProj_772

import subProj_772.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_772")
    name = "subProj 772"

    buildType(subProj_bt_772_1)
    buildType(subProj_bt_772_0)
    buildType(subProj_bt_772_3)
    buildType(subProj_bt_772_2)
    buildType(subProj_bt_772_5)
    buildType(subProj_bt_772_4)
})
