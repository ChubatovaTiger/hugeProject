package subProj_289

import subProj_289.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_289")
    name = "subProj 289"

    buildType(subProj_bt_289_5)
    buildType(subProj_bt_289_4)
    buildType(subProj_bt_289_3)
    buildType(subProj_bt_289_2)
    buildType(subProj_bt_289_1)
    buildType(subProj_bt_289_0)
})
