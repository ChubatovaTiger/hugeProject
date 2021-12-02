package subProj_664

import subProj_664.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_664")
    name = "subProj 664"

    buildType(subProj_bt_664_5)
    buildType(subProj_bt_664_4)
    buildType(subProj_bt_664_3)
    buildType(subProj_bt_664_2)
    buildType(subProj_bt_664_1)
    buildType(subProj_bt_664_0)
})
