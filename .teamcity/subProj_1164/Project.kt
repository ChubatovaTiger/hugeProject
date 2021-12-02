package subProj_1164

import subProj_1164.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1164")
    name = "subProj 1164"

    buildType(subProj_bt_1164_5)
    buildType(subProj_bt_1164_4)
    buildType(subProj_bt_1164_3)
    buildType(subProj_bt_1164_2)
    buildType(subProj_bt_1164_1)
    buildType(subProj_bt_1164_0)
})
