package subProj_1991

import subProj_1991.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1991")
    name = "subProj 1991"

    buildType(subProj_bt_1991_3)
    buildType(subProj_bt_1991_2)
    buildType(subProj_bt_1991_5)
    buildType(subProj_bt_1991_4)
    buildType(subProj_bt_1991_1)
    buildType(subProj_bt_1991_0)
})
