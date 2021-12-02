package subProj_68

import subProj_68.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_68")
    name = "subProj 68"

    buildType(subProj_bt_68_2)
    buildType(subProj_bt_68_3)
    buildType(subProj_bt_68_0)
    buildType(subProj_bt_68_1)
    buildType(subProj_bt_68_4)
    buildType(subProj_bt_68_5)
})
