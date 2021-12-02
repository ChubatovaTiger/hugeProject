package subProj_991

import subProj_991.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_991")
    name = "subProj 991"

    buildType(subProj_bt_991_1)
    buildType(subProj_bt_991_2)
    buildType(subProj_bt_991_0)
    buildType(subProj_bt_991_5)
    buildType(subProj_bt_991_3)
    buildType(subProj_bt_991_4)
})
