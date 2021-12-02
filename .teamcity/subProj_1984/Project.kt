package subProj_1984

import subProj_1984.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1984")
    name = "subProj 1984"

    buildType(subProj_bt_1984_3)
    buildType(subProj_bt_1984_2)
    buildType(subProj_bt_1984_5)
    buildType(subProj_bt_1984_4)
    buildType(subProj_bt_1984_1)
    buildType(subProj_bt_1984_0)
})
