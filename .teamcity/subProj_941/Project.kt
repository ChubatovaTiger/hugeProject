package subProj_941

import subProj_941.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_941")
    name = "subProj 941"

    buildType(subProj_bt_941_0)
    buildType(subProj_bt_941_1)
    buildType(subProj_bt_941_2)
    buildType(subProj_bt_941_3)
    buildType(subProj_bt_941_4)
    buildType(subProj_bt_941_5)
})
