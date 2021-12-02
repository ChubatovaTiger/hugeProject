package subProj_518

import subProj_518.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_518")
    name = "subProj 518"

    buildType(subProj_bt_518_4)
    buildType(subProj_bt_518_5)
    buildType(subProj_bt_518_2)
    buildType(subProj_bt_518_3)
    buildType(subProj_bt_518_0)
    buildType(subProj_bt_518_1)
})
