package subProj_1378

import subProj_1378.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1378")
    name = "subProj 1378"

    buildType(subProj_bt_1378_0)
    buildType(subProj_bt_1378_1)
    buildType(subProj_bt_1378_2)
    buildType(subProj_bt_1378_3)
    buildType(subProj_bt_1378_4)
    buildType(subProj_bt_1378_5)
})
