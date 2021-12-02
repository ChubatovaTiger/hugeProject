package subProj_1488

import subProj_1488.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1488")
    name = "subProj 1488"

    buildType(subProj_bt_1488_5)
    buildType(subProj_bt_1488_3)
    buildType(subProj_bt_1488_4)
    buildType(subProj_bt_1488_1)
    buildType(subProj_bt_1488_2)
    buildType(subProj_bt_1488_0)
})
