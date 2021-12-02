package subProj_1379

import subProj_1379.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1379")
    name = "subProj 1379"

    buildType(subProj_bt_1379_0)
    buildType(subProj_bt_1379_1)
    buildType(subProj_bt_1379_2)
    buildType(subProj_bt_1379_3)
    buildType(subProj_bt_1379_4)
    buildType(subProj_bt_1379_5)
})
