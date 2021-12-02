package subProj_1893

import subProj_1893.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1893")
    name = "subProj 1893"

    buildType(subProj_bt_1893_5)
    buildType(subProj_bt_1893_4)
    buildType(subProj_bt_1893_3)
    buildType(subProj_bt_1893_2)
    buildType(subProj_bt_1893_1)
    buildType(subProj_bt_1893_0)
})
