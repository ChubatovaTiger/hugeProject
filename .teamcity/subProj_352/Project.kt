package subProj_352

import subProj_352.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_352")
    name = "subProj 352"

    buildType(subProj_bt_352_4)
    buildType(subProj_bt_352_5)
    buildType(subProj_bt_352_0)
    buildType(subProj_bt_352_1)
    buildType(subProj_bt_352_2)
    buildType(subProj_bt_352_3)
})
