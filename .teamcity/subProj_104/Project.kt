package subProj_104

import subProj_104.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_104")
    name = "subProj 104"

    buildType(subProj_bt_104_5)
    buildType(subProj_bt_104_3)
    buildType(subProj_bt_104_4)
    buildType(subProj_bt_104_1)
    buildType(subProj_bt_104_2)
    buildType(subProj_bt_104_0)
})
