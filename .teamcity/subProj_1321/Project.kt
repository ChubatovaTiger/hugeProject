package subProj_1321

import subProj_1321.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1321")
    name = "subProj 1321"

    buildType(subProj_bt_1321_0)
    buildType(subProj_bt_1321_5)
    buildType(subProj_bt_1321_3)
    buildType(subProj_bt_1321_4)
    buildType(subProj_bt_1321_1)
    buildType(subProj_bt_1321_2)
})
