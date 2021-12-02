package subProj_186

import subProj_186.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_186")
    name = "subProj 186"

    buildType(subProj_bt_186_0)
    buildType(subProj_bt_186_2)
    buildType(subProj_bt_186_1)
    buildType(subProj_bt_186_4)
    buildType(subProj_bt_186_3)
    buildType(subProj_bt_186_5)
})
