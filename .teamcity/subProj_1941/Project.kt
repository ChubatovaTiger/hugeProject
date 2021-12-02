package subProj_1941

import subProj_1941.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1941")
    name = "subProj 1941"

    buildType(subProj_bt_1941_0)
    buildType(subProj_bt_1941_4)
    buildType(subProj_bt_1941_3)
    buildType(subProj_bt_1941_2)
    buildType(subProj_bt_1941_1)
    buildType(subProj_bt_1941_5)
})
