package subProj_80

import subProj_80.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_80")
    name = "subProj 80"

    buildType(subProj_bt_80_4)
    buildType(subProj_bt_80_5)
    buildType(subProj_bt_80_2)
    buildType(subProj_bt_80_3)
    buildType(subProj_bt_80_0)
    buildType(subProj_bt_80_1)
})
