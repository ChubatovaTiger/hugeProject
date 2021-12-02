package subProj_729

import subProj_729.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_729")
    name = "subProj 729"

    buildType(subProj_bt_729_1)
    buildType(subProj_bt_729_0)
    buildType(subProj_bt_729_5)
    buildType(subProj_bt_729_4)
    buildType(subProj_bt_729_3)
    buildType(subProj_bt_729_2)
})
