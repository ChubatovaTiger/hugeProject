package subProj_1809

import subProj_1809.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1809")
    name = "subProj 1809"

    buildType(subProj_bt_1809_5)
    buildType(subProj_bt_1809_4)
    buildType(subProj_bt_1809_3)
    buildType(subProj_bt_1809_2)
    buildType(subProj_bt_1809_1)
    buildType(subProj_bt_1809_0)
})
