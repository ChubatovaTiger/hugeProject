package subProj_1512

import subProj_1512.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1512")
    name = "subProj 1512"

    buildType(subProj_bt_1512_5)
    buildType(subProj_bt_1512_0)
    buildType(subProj_bt_1512_2)
    buildType(subProj_bt_1512_1)
    buildType(subProj_bt_1512_4)
    buildType(subProj_bt_1512_3)
})
