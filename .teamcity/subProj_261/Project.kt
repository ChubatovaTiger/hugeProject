package subProj_261

import subProj_261.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_261")
    name = "subProj 261"

    buildType(subProj_bt_261_5)
    buildType(subProj_bt_261_3)
    buildType(subProj_bt_261_4)
    buildType(subProj_bt_261_1)
    buildType(subProj_bt_261_2)
    buildType(subProj_bt_261_0)
})
