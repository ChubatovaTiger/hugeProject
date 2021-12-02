package subProj_362

import subProj_362.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_362")
    name = "subProj 362"

    buildType(subProj_bt_362_5)
    buildType(subProj_bt_362_1)
    buildType(subProj_bt_362_2)
    buildType(subProj_bt_362_3)
    buildType(subProj_bt_362_4)
    buildType(subProj_bt_362_0)
})
