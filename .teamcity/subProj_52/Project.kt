package subProj_52

import subProj_52.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_52")
    name = "subProj 52"

    buildType(subProj_bt_52_0)
    buildType(subProj_bt_52_2)
    buildType(subProj_bt_52_1)
    buildType(subProj_bt_52_4)
    buildType(subProj_bt_52_3)
    buildType(subProj_bt_52_5)
})
