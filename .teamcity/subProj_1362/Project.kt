package subProj_1362

import subProj_1362.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1362")
    name = "subProj 1362"

    buildType(subProj_bt_1362_3)
    buildType(subProj_bt_1362_2)
    buildType(subProj_bt_1362_1)
    buildType(subProj_bt_1362_0)
    buildType(subProj_bt_1362_5)
    buildType(subProj_bt_1362_4)
})
