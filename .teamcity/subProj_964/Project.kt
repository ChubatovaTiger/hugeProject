package subProj_964

import subProj_964.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_964")
    name = "subProj 964"

    buildType(subProj_bt_964_5)
    buildType(subProj_bt_964_0)
    buildType(subProj_bt_964_2)
    buildType(subProj_bt_964_1)
    buildType(subProj_bt_964_4)
    buildType(subProj_bt_964_3)
})
