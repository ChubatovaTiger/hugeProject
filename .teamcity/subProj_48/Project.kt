package subProj_48

import subProj_48.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_48")
    name = "subProj 48"

    buildType(subProj_bt_48_1)
    buildType(subProj_bt_48_0)
    buildType(subProj_bt_48_3)
    buildType(subProj_bt_48_2)
    buildType(subProj_bt_48_5)
    buildType(subProj_bt_48_4)
})
