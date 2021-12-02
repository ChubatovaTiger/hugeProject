package subProj_512

import subProj_512.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_512")
    name = "subProj 512"

    buildType(subProj_bt_512_4)
    buildType(subProj_bt_512_5)
    buildType(subProj_bt_512_2)
    buildType(subProj_bt_512_3)
    buildType(subProj_bt_512_0)
    buildType(subProj_bt_512_1)
})
