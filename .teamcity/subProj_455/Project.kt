package subProj_455

import subProj_455.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_455")
    name = "subProj 455"

    buildType(subProj_bt_455_2)
    buildType(subProj_bt_455_3)
    buildType(subProj_bt_455_0)
    buildType(subProj_bt_455_1)
    buildType(subProj_bt_455_4)
    buildType(subProj_bt_455_5)
})
